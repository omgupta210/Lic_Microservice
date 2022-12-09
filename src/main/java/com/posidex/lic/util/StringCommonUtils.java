//package com.posidex.lic.util;
///*
// * Copyright � 2009 Posidex Technologies Pvt Ltd. All rights reserved.
// * 
// * Created on Feb 10, 2008
// */
//
//
//import java.util.ArrayList;
//import org.springframework.util.*;
//import java.util.List;
//import java.util.ResourceBundle;
//import java.util.StringTokenizer;
//
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
//
//
///**
// * @author <a href="mailto:madankm@posidex.com">Madan KM</a>
// * @version v1.0
// * @see org.apache.commons.lang.StringUtils
// */
//public class StringCommonUtils extends StringUtils
//{
//
//	private static final Log logger=LogFactory.getLog(StringCommonUtils.class.getName());
//  /**
//   * Checks to see if the param is null or blank string with or without empty spaces. 
//   * @param str
//   * @return true if the string has a value after trimming empty spaces.
//   */
//  public static boolean isNotBlank(String str)
//  {
//    if(StringUtils.isNotEmpty(str) && !"".equals(str.trim())) return true;//$NON-NLS-1$
//    return false;
//  }
//  
//  /**
//   * Checks to see if the param is null or blank string.
//   * @param str The string to check.
//   * @return True if the param is null or has no value after trimming empty spaces.
//   */
//  public static boolean isBlank(String str)
//  {
//    if(StringUtils.isEmpty(str) || "".equals(str.trim())) return true;
//    return false;
//  }
//  public static String getName(String bundleName,String key) throws Exception
//  {
//    logger.debug("In Query for: "+bundleName);//$NON-NLS-1$
//    String keyVal=null;
//    try
//    {
//      ResourceBundle bundle = ResourceBundle.getBundle(bundleName);
//      if(bundle != null)
//      {
//          keyVal = bundle.getString(key);
//      }
//    }
//    catch(Exception ex)
//    {
//      logger.error("Error while getQuery(): "+ex.getMessage());//$NON-NLS-1$
//    }
//    logger.debug("Leaving getSize: "+keyVal);
//    return keyVal;
//  }
//  public static List<String> toArrayList(String str, String delimiter)
//  {
//	 List<String> list=new ArrayList<String>();
//	 if(str.length()>0)
//	 {
//		StringTokenizer tokenizer=new StringTokenizer(str,delimiter);
//	 	while(tokenizer.hasMoreTokens())
//	 	{
//	 		list.add(tokenizer.nextToken());
//	 	}
//	 }
//	 return list;
//  }
//  public static String toStringFromList(List<String> list,String delim)
//  {
//	  StringBuffer buffer=new StringBuffer();
//	  if(list.size()>0)
//	  {  
//		  for(int i=0;i<list.size();i++)
//		  {
//			  buffer.append(list.get(i));
//			  buffer.append(",");
//		  }
//	  }
//	  return buffer.length()>0?buffer.substring(0,buffer.length()-1):"";
//  }
//  public static void main(String[] args) 
//  {
//	  String str="";
//	  String delim=",";
//	  System.out.println(toArrayList(str, delim));
//	  
//	  List<String> list=new ArrayList<String>();
//	  //list.add("venkat");
//	  //list.add("jagan");
//	 // list.add("hari");
//	 // list.add("shiva");
//	  System.out.println(toStringFromList(list,delim));
//  }
//  
//}
