package com.example.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
//aula 361 - 11/02/2026

public class URL {
 public static String decodeParam(String txt) {
	 try {
		return URLDecoder.decode(txt, "utf-8");
	 } catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return"";
	 }
	 
}}
