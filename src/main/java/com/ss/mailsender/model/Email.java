package com.ss.mailsender.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author VGolovin
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Email {

    private String to;
    private String subject;
    private String body;

}
