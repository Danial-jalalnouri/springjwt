package com.jndanial.springjwt.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;
/**
 * Created by jndanial.com (danial jalal nouri).
 * http://http://www.jndanial.com/54/
 */
@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {

}
