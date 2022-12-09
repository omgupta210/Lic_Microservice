/**
 * 
 */
package com.posidex.lic.util;


import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import com.posidex.common.message.ServiceMessage;
//import com.posidex.common.util.PsxCommonConstants;
//import com.posidex.jms.exception.ResponseTimedOutException;
//import com.posidex.service.util.SpringJmsUtils;


/**
 * @author PTPL-080[Harinadh]
 */
public class MessageCreator
{
	/**
	 * 
	 */
	private static final long	serialVersionUID					= 4622256748702928840L;

	/** The Constant logger. */
	private static final Log	logger								= LogFactory.getLog(MessageCreator.class.getName());

	public static final String	PRIMEMATCH_REQUEST_QUEUE			= "PrimeMatchRequestQueue";

	public static final String	PRIMEMATCH_RESPONSE_QUEUE			= "PrimeMatchResponseQueue";

	public static final String	PRIMEMATCH_BULKQRY_REQUEST_QUEUE	= "PrimeMatchBulkQryRequestQueue";

	public static final String	PRIMEMATCH_BULKQRY_RESPONSE_QUEUE	= "PrimeMatchBulkQryResponseQueue";
	
	public static final String	HASHING_REQUEST_QUEUE			= "HashingRequestQueue";
	public static final String  PSX_GRP_VERIFICATION_AP_Q		= "ClusterVerificationQueue";

	private static final String	SERVICE_HINT_JSON					= "JSON";
	public static final String	BROKER_NEW_PM					= "BROKERNEWPM";

	

	private static Properties	jmsQueueProperties					= new Properties();

	static
	{
		logger.debug("Inside MessageCreator.static block.....");
		try
		{
			logger.debug("Loading... jms queue names first time");
			jmsQueueProperties.load(getInputStream("JmsQueueNames.properties"));
		}
		catch (Exception e)
		{
			logger.error("Error while loading jms queue names and jms resources!!!" + e.getMessage()); //$NON-NLS-1$
		}
	}

//	public ServiceMessage sendNRecieveServiceMessage( Long requestId, Properties application ) throws Exception
//	{
//		logger.info("In sendNRecieveServiceMessage() method with requestId:" + requestId);
//		ServiceMessage serviceMessage = null;
//		try
//		{
//			serviceMessage = new ServiceMessage();
//			serviceMessage.setRequestIdBatchId(String.valueOf(requestId));
//			serviceMessage.setPsxIdBatchId(requestId);
//			serviceMessage.setProcessMode(PsxCommonConstants.NORMAL_MODE);
//			serviceMessage.setServiceHint(SERVICE_HINT_JSON);
//			serviceMessage.setParamMap(new HashMap<String, Object>());
//
//			//This map is to set Message Properties to Object Message.
//			Map<String, Object> objectMessagePropsNValues = new HashMap<String, Object>();
//			objectMessagePropsNValues.put("psxId", String.valueOf(requestId));
//
//			SpringJmsUtils springJmsObject = SpringJmsUtils.getInstance();
//			logger.debug("++++++++++++++++Sending Request time for psxId[" + requestId + "]++++++++++++++++:" + WebClientCommonUtils.getFormattedDate(new Date(), WebClientConstants.JMS_SEND_RECIEVE_TIME_FORMAT));
//			System.out.println("queue name+++++++++++" + jmsQueueProperties.getProperty(PRIMEMATCH_REQUEST_QUEUE));
//			//Sending Service Message to PrimeMatch Request Queue
//			springJmsObject.sendServiceMessage(jmsQueueProperties.getProperty(PRIMEMATCH_REQUEST_QUEUE), serviceMessage, objectMessagePropsNValues);
//
//			//Receiving Service Message from PrimeMatch Response Queue based on message filter synchronously. 
//			serviceMessage = (ServiceMessage)springJmsObject.recieveFilteredObjectMessage(jmsQueueProperties.getProperty(PRIMEMATCH_RESPONSE_QUEUE), Integer.parseInt(application.getProperty("jms.reponse.timeOut").trim()), Byte.parseByte(application.getProperty("jms.acknowledge.mode")), "psxId='" + requestId + "'");
//			logger.debug("++++++++++++++++Recieved Response time for psxId[" + requestId + "]++++++++++++++++:" + WebClientCommonUtils.getFormattedDate(new Date(), WebClientConstants.JMS_SEND_RECIEVE_TIME_FORMAT));
//		}
//		catch (ResponseTimedOutException ex)
//		{
//			logger.error("##########JMS Response Time Out for PsxId[" + requestId + "]############");
//			throw new ResponseTimedOutException(ex.getMessage());
//		}
//		catch (Exception ex)
//		{
//			logger.error("Error in sendNRecieveServiceMessage for psxId(requestId):" + requestId + ",error message:" + ex.getMessage());
//			//logger.error(ex, ex);
//			ex.printStackTrace();
//			throw new Exception(ex.getMessage());
//		}
//		return serviceMessage;
//	}

	/**
	 * Gets the input stream.
	 * 
	 * @param fileName the file name
	 * @return the input stream
	 * @throws Exception the exception
	 */
	public static InputStream getInputStream( String fileName ) throws Exception
	{
		InputStream inputStream = null;
		try
		{
			inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
			if (inputStream != null)
			{
				return inputStream;
			}

			inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			if (inputStream != null)
			{
				return inputStream;
			}

			inputStream = MessageCreator.class.getClassLoader().getResourceAsStream(fileName);
			if (inputStream != null)
			{
				return inputStream;
			}
			inputStream = MessageCreator.class.getResourceAsStream(fileName);
			if (inputStream == null)
			{
				logger.error("Unable to get Input Stream for file: " + fileName); //$NON-NLS-1$
				throw new Exception("Unable to get Input Stream for file: " + fileName); //$NON-NLS-1$
			}
		}
		catch (Exception e)
		{
			logger.error("Error while getting given file as a input stream: " + e.getMessage()); //$NON-NLS-1$
			throw new Exception(e);
		}
		return inputStream;
	}

	public static Properties getJmsQueueNamesProperties()
	{
		return jmsQueueProperties;
	}
}
