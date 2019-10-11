package com.ryan.www.handler;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ryan on 2018/11/16.
 */
@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public Map<String,Object> exceptionHandler(MethodArgumentNotValidException e){
        Map map=new HashMap<>();
        map.put("code",500);
        map.put("msg",e.getBindingResult().getFieldError().getDefaultMessage());
        return map;
    }

    @ExceptionHandler({RuntimeException.class})
    public Map<String,Object> exceptionHandler(Exception e){
        Map map=new HashMap<>();
        map.put("code",500);
        map.put("msg",e.getMessage());
        return map;
    }
}
