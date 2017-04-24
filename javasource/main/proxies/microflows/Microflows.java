// This file was generated by Mendix Modeler 7.1.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Main module
	public static main.proxies.SlackImage apiGetImage(IContext context, java.lang.String _url, java.lang.String _mimetype, java.lang.String _operation, java.lang.String _imageId, java.lang.String _payload)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Url", _url);
			params.put("Mimetype", _mimetype);
			params.put("Operation", _operation);
			params.put("ImageId", _imageId);
			params.put("Payload", _payload);
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.ApiGetImage", params);
			return result == null ? null : main.proxies.SlackImage.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean convertStringToBoolean(IContext context, java.lang.String _booleanString)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("BooleanString", _booleanString);
			return (java.lang.Boolean)Core.execute(context, "Main.ConvertStringToBoolean", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.math.BigDecimal convertStringToDecimal(IContext context, java.lang.String _stringValue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringValue", _stringValue);
			return (java.math.BigDecimal)Core.execute(context, "Main.ConvertStringToDecimal", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.SlackMessageReceived findImage(IContext context, java.lang.String _findQuery, main.proxies.SlackMessageReceived _slackMessageReceived)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("FindQuery", _findQuery);
			params.put("SlackMessageReceived", _slackMessageReceived == null ? null : _slackMessageReceived.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.FindImage", params);
			return result == null ? null : main.proxies.SlackMessageReceived.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static system.proxies.User getCurrentUser(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.GetCurrentUser", params);
			return result == null ? null : system.proxies.User.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.SlackImageRecognitionRequest getDetectFacesRequest(IContext context, main.proxies.SlackImageRecognitionRequest _mappingParameter)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MappingParameter", _mappingParameter == null ? null : _mappingParameter.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.GetDetectFacesRequest", params);
			return result == null ? null : main.proxies.SlackImageRecognitionRequest.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.ImageReport getImageReport(IContext context, java.lang.String _url, java.lang.String _mimetype, java.lang.String _operation, java.lang.String _imageId, java.lang.String _payload, java.lang.String _refresh)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Url", _url);
			params.put("Mimetype", _mimetype);
			params.put("Operation", _operation);
			params.put("ImageId", _imageId);
			params.put("Payload", _payload);
			params.put("Refresh", _refresh);
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.GetImageReport", params);
			return result == null ? null : main.proxies.ImageReport.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.SlackImageRecognitionRequest getImportMappingObject(IContext context, main.proxies.SlackImageRecognitionRequest _mappingParameter)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MappingParameter", _mappingParameter == null ? null : _mappingParameter.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.GetImportMappingObject", params);
			return result == null ? null : main.proxies.SlackImageRecognitionRequest.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void getSlackImage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.GetSlackImage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean onAppStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "Main.OnAppStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onSlackMessage(IContext context, java.lang.String _content, java.lang.String _eventJson, java.lang.String _senderId, java.lang.String _channelId, java.util.Date _timestamp)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Content", _content);
			params.put("EventJson", _eventJson);
			params.put("SenderId", _senderId);
			params.put("ChannelId", _channelId);
			params.put("Timestamp", _timestamp);
			Core.execute(context, "Main.OnSlackMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onWhatDoYouSeeRequest(IContext context, main.proxies.SlackImageRecognitionRequest _newSlackImageRecognitionRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("NewSlackImageRecognitionRequest", _newSlackImageRecognitionRequest == null ? null : _newSlackImageRecognitionRequest.getMendixObject());
			Core.execute(context, "Main.OnWhatDoYouSeeRequest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerApis(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.RegisterApis", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static main.proxies.SlackImageRecognitionRequest rekognizeImage(IContext context, main.proxies.SlackImageRecognitionRequest _slackImageRecognitionRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SlackImageRecognitionRequest", _slackImageRecognitionRequest == null ? null : _slackImageRecognitionRequest.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "Main.RekognizeImage", params);
			return result == null ? null : main.proxies.SlackImageRecognitionRequest.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sendSlackResponse(IContext context, java.lang.String _messageTemplateName, java.lang.String _slackChannelId, java.lang.String _slackUserId, main.proxies.SlackMessageReceived _inResponseTo)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MessageTemplateName", _messageTemplateName);
			params.put("SlackChannelId", _slackChannelId);
			params.put("SlackUserId", _slackUserId);
			params.put("InResponseTo", _inResponseTo == null ? null : _inResponseTo.getMendixObject());
			Core.execute(context, "Main.SendSlackResponse", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void slackListener(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.SlackListener", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void slackPing(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Main.SlackPing", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}