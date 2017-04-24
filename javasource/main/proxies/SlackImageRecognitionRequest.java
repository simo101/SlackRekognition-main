// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class SlackImageRecognitionRequest
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject slackImageRecognitionRequestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.SlackImageRecognitionRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Upload("Upload"),
		Channel("Channel"),
		Text("Text"),
		User("User"),
		Username("Username"),
		BasicUsername("BasicUsername"),
		Url_private("Url_private"),
		SlackEventJson("SlackEventJson"),
		S3BucketKey("S3BucketKey"),
		S3Bucket("S3Bucket"),
		S3Key("S3Key"),
		LabelsJson("LabelsJson"),
		DetectFacesJson("DetectFacesJson"),
		PublicResourceId("PublicResourceId"),
		request_image("Main.request_image"),
		SlackImageRecognitionRequest_SlackMessageReceived("Main.SlackImageRecognitionRequest_SlackMessageReceived"),
		SlackImageRecognitionRequest_ImageReport("Main.SlackImageRecognitionRequest_ImageReport");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SlackImageRecognitionRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.SlackImageRecognitionRequest"));
	}

	protected SlackImageRecognitionRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject slackImageRecognitionRequestMendixObject)
	{
		if (slackImageRecognitionRequestMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Main.SlackImageRecognitionRequest", slackImageRecognitionRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.SlackImageRecognitionRequest");

		this.slackImageRecognitionRequestMendixObject = slackImageRecognitionRequestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SlackImageRecognitionRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.SlackImageRecognitionRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.SlackImageRecognitionRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static main.proxies.SlackImageRecognitionRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.SlackImageRecognitionRequest(context, mendixObject);
	}

	public static main.proxies.SlackImageRecognitionRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.SlackImageRecognitionRequest.initialize(context, mendixObject);
	}

	public static java.util.List<main.proxies.SlackImageRecognitionRequest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<main.proxies.SlackImageRecognitionRequest> result = new java.util.ArrayList<main.proxies.SlackImageRecognitionRequest>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Main.SlackImageRecognitionRequest" + xpathConstraint))
			result.add(main.proxies.SlackImageRecognitionRequest.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Upload
	 */
	public final java.lang.Boolean getUpload()
	{
		return getUpload(getContext());
	}

	/**
	 * @param context
	 * @return value of Upload
	 */
	public final java.lang.Boolean getUpload(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Upload.toString());
	}

	/**
	 * Set value of Upload
	 * @param upload
	 */
	public final void setUpload(java.lang.Boolean upload)
	{
		setUpload(getContext(), upload);
	}

	/**
	 * Set value of Upload
	 * @param context
	 * @param upload
	 */
	public final void setUpload(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean upload)
	{
		getMendixObject().setValue(context, MemberNames.Upload.toString(), upload);
	}

	/**
	 * @return value of Channel
	 */
	public final java.lang.String getChannel()
	{
		return getChannel(getContext());
	}

	/**
	 * @param context
	 * @return value of Channel
	 */
	public final java.lang.String getChannel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Channel.toString());
	}

	/**
	 * Set value of Channel
	 * @param channel
	 */
	public final void setChannel(java.lang.String channel)
	{
		setChannel(getContext(), channel);
	}

	/**
	 * Set value of Channel
	 * @param context
	 * @param channel
	 */
	public final void setChannel(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String channel)
	{
		getMendixObject().setValue(context, MemberNames.Channel.toString(), channel);
	}

	/**
	 * @return value of Text
	 */
	public final java.lang.String getText()
	{
		return getText(getContext());
	}

	/**
	 * @param context
	 * @return value of Text
	 */
	public final java.lang.String getText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Text.toString());
	}

	/**
	 * Set value of Text
	 * @param text
	 */
	public final void setText(java.lang.String text)
	{
		setText(getContext(), text);
	}

	/**
	 * Set value of Text
	 * @param context
	 * @param text
	 */
	public final void setText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.Text.toString(), text);
	}

	/**
	 * @return value of User
	 */
	public final java.lang.String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final java.lang.String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(java.lang.String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of Username
	 */
	public final java.lang.String getUsername()
	{
		return getUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of Username
	 */
	public final java.lang.String getUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Username.toString());
	}

	/**
	 * Set value of Username
	 * @param username
	 */
	public final void setUsername(java.lang.String username)
	{
		setUsername(getContext(), username);
	}

	/**
	 * Set value of Username
	 * @param context
	 * @param username
	 */
	public final void setUsername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String username)
	{
		getMendixObject().setValue(context, MemberNames.Username.toString(), username);
	}

	/**
	 * @return value of BasicUsername
	 */
	public final java.lang.String getBasicUsername()
	{
		return getBasicUsername(getContext());
	}

	/**
	 * @param context
	 * @return value of BasicUsername
	 */
	public final java.lang.String getBasicUsername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.BasicUsername.toString());
	}

	/**
	 * Set value of BasicUsername
	 * @param basicusername
	 */
	public final void setBasicUsername(java.lang.String basicusername)
	{
		setBasicUsername(getContext(), basicusername);
	}

	/**
	 * Set value of BasicUsername
	 * @param context
	 * @param basicusername
	 */
	public final void setBasicUsername(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String basicusername)
	{
		getMendixObject().setValue(context, MemberNames.BasicUsername.toString(), basicusername);
	}

	/**
	 * @return value of Url_private
	 */
	public final java.lang.String getUrl_private()
	{
		return getUrl_private(getContext());
	}

	/**
	 * @param context
	 * @return value of Url_private
	 */
	public final java.lang.String getUrl_private(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Url_private.toString());
	}

	/**
	 * Set value of Url_private
	 * @param url_private
	 */
	public final void setUrl_private(java.lang.String url_private)
	{
		setUrl_private(getContext(), url_private);
	}

	/**
	 * Set value of Url_private
	 * @param context
	 * @param url_private
	 */
	public final void setUrl_private(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url_private)
	{
		getMendixObject().setValue(context, MemberNames.Url_private.toString(), url_private);
	}

	/**
	 * @return value of SlackEventJson
	 */
	public final java.lang.String getSlackEventJson()
	{
		return getSlackEventJson(getContext());
	}

	/**
	 * @param context
	 * @return value of SlackEventJson
	 */
	public final java.lang.String getSlackEventJson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SlackEventJson.toString());
	}

	/**
	 * Set value of SlackEventJson
	 * @param slackeventjson
	 */
	public final void setSlackEventJson(java.lang.String slackeventjson)
	{
		setSlackEventJson(getContext(), slackeventjson);
	}

	/**
	 * Set value of SlackEventJson
	 * @param context
	 * @param slackeventjson
	 */
	public final void setSlackEventJson(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String slackeventjson)
	{
		getMendixObject().setValue(context, MemberNames.SlackEventJson.toString(), slackeventjson);
	}

	/**
	 * @return value of S3BucketKey
	 */
	public final java.lang.String getS3BucketKey()
	{
		return getS3BucketKey(getContext());
	}

	/**
	 * @param context
	 * @return value of S3BucketKey
	 */
	public final java.lang.String getS3BucketKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.S3BucketKey.toString());
	}

	/**
	 * Set value of S3BucketKey
	 * @param s3bucketkey
	 */
	public final void setS3BucketKey(java.lang.String s3bucketkey)
	{
		setS3BucketKey(getContext(), s3bucketkey);
	}

	/**
	 * Set value of S3BucketKey
	 * @param context
	 * @param s3bucketkey
	 */
	public final void setS3BucketKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String s3bucketkey)
	{
		getMendixObject().setValue(context, MemberNames.S3BucketKey.toString(), s3bucketkey);
	}

	/**
	 * @return value of S3Bucket
	 */
	public final java.lang.String getS3Bucket()
	{
		return getS3Bucket(getContext());
	}

	/**
	 * @param context
	 * @return value of S3Bucket
	 */
	public final java.lang.String getS3Bucket(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.S3Bucket.toString());
	}

	/**
	 * Set value of S3Bucket
	 * @param s3bucket
	 */
	public final void setS3Bucket(java.lang.String s3bucket)
	{
		setS3Bucket(getContext(), s3bucket);
	}

	/**
	 * Set value of S3Bucket
	 * @param context
	 * @param s3bucket
	 */
	public final void setS3Bucket(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String s3bucket)
	{
		getMendixObject().setValue(context, MemberNames.S3Bucket.toString(), s3bucket);
	}

	/**
	 * @return value of S3Key
	 */
	public final java.lang.String getS3Key()
	{
		return getS3Key(getContext());
	}

	/**
	 * @param context
	 * @return value of S3Key
	 */
	public final java.lang.String getS3Key(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.S3Key.toString());
	}

	/**
	 * Set value of S3Key
	 * @param s3key
	 */
	public final void setS3Key(java.lang.String s3key)
	{
		setS3Key(getContext(), s3key);
	}

	/**
	 * Set value of S3Key
	 * @param context
	 * @param s3key
	 */
	public final void setS3Key(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String s3key)
	{
		getMendixObject().setValue(context, MemberNames.S3Key.toString(), s3key);
	}

	/**
	 * @return value of LabelsJson
	 */
	public final java.lang.String getLabelsJson()
	{
		return getLabelsJson(getContext());
	}

	/**
	 * @param context
	 * @return value of LabelsJson
	 */
	public final java.lang.String getLabelsJson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LabelsJson.toString());
	}

	/**
	 * Set value of LabelsJson
	 * @param labelsjson
	 */
	public final void setLabelsJson(java.lang.String labelsjson)
	{
		setLabelsJson(getContext(), labelsjson);
	}

	/**
	 * Set value of LabelsJson
	 * @param context
	 * @param labelsjson
	 */
	public final void setLabelsJson(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String labelsjson)
	{
		getMendixObject().setValue(context, MemberNames.LabelsJson.toString(), labelsjson);
	}

	/**
	 * @return value of DetectFacesJson
	 */
	public final java.lang.String getDetectFacesJson()
	{
		return getDetectFacesJson(getContext());
	}

	/**
	 * @param context
	 * @return value of DetectFacesJson
	 */
	public final java.lang.String getDetectFacesJson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DetectFacesJson.toString());
	}

	/**
	 * Set value of DetectFacesJson
	 * @param detectfacesjson
	 */
	public final void setDetectFacesJson(java.lang.String detectfacesjson)
	{
		setDetectFacesJson(getContext(), detectfacesjson);
	}

	/**
	 * Set value of DetectFacesJson
	 * @param context
	 * @param detectfacesjson
	 */
	public final void setDetectFacesJson(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String detectfacesjson)
	{
		getMendixObject().setValue(context, MemberNames.DetectFacesJson.toString(), detectfacesjson);
	}

	/**
	 * @return value of PublicResourceId
	 */
	public final java.lang.String getPublicResourceId()
	{
		return getPublicResourceId(getContext());
	}

	/**
	 * @param context
	 * @return value of PublicResourceId
	 */
	public final java.lang.String getPublicResourceId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PublicResourceId.toString());
	}

	/**
	 * Set value of PublicResourceId
	 * @param publicresourceid
	 */
	public final void setPublicResourceId(java.lang.String publicresourceid)
	{
		setPublicResourceId(getContext(), publicresourceid);
	}

	/**
	 * Set value of PublicResourceId
	 * @param context
	 * @param publicresourceid
	 */
	public final void setPublicResourceId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String publicresourceid)
	{
		getMendixObject().setValue(context, MemberNames.PublicResourceId.toString(), publicresourceid);
	}

	/**
	 * @return value of request_image
	 */
	public final main.proxies.SlackImage getrequest_image() throws com.mendix.core.CoreException
	{
		return getrequest_image(getContext());
	}

	/**
	 * @param context
	 * @return value of request_image
	 */
	public final main.proxies.SlackImage getrequest_image(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.SlackImage result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.request_image.toString());
		if (identifier != null)
			result = main.proxies.SlackImage.load(context, identifier);
		return result;
	}

	/**
	 * Set value of request_image
	 * @param request_image
	 */
	public final void setrequest_image(main.proxies.SlackImage request_image)
	{
		setrequest_image(getContext(), request_image);
	}

	/**
	 * Set value of request_image
	 * @param context
	 * @param request_image
	 */
	public final void setrequest_image(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.SlackImage request_image)
	{
		if (request_image == null)
			getMendixObject().setValue(context, MemberNames.request_image.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.request_image.toString(), request_image.getMendixObject().getId());
	}

	/**
	 * @return value of SlackImageRecognitionRequest_SlackMessageReceived
	 */
	public final main.proxies.SlackMessageReceived getSlackImageRecognitionRequest_SlackMessageReceived() throws com.mendix.core.CoreException
	{
		return getSlackImageRecognitionRequest_SlackMessageReceived(getContext());
	}

	/**
	 * @param context
	 * @return value of SlackImageRecognitionRequest_SlackMessageReceived
	 */
	public final main.proxies.SlackMessageReceived getSlackImageRecognitionRequest_SlackMessageReceived(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.SlackMessageReceived result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SlackImageRecognitionRequest_SlackMessageReceived.toString());
		if (identifier != null)
			result = main.proxies.SlackMessageReceived.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SlackImageRecognitionRequest_SlackMessageReceived
	 * @param slackimagerecognitionrequest_slackmessagereceived
	 */
	public final void setSlackImageRecognitionRequest_SlackMessageReceived(main.proxies.SlackMessageReceived slackimagerecognitionrequest_slackmessagereceived)
	{
		setSlackImageRecognitionRequest_SlackMessageReceived(getContext(), slackimagerecognitionrequest_slackmessagereceived);
	}

	/**
	 * Set value of SlackImageRecognitionRequest_SlackMessageReceived
	 * @param context
	 * @param slackimagerecognitionrequest_slackmessagereceived
	 */
	public final void setSlackImageRecognitionRequest_SlackMessageReceived(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.SlackMessageReceived slackimagerecognitionrequest_slackmessagereceived)
	{
		if (slackimagerecognitionrequest_slackmessagereceived == null)
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_SlackMessageReceived.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_SlackMessageReceived.toString(), slackimagerecognitionrequest_slackmessagereceived.getMendixObject().getId());
	}

	/**
	 * @return value of SlackImageRecognitionRequest_ImageReport
	 */
	public final main.proxies.ImageReport getSlackImageRecognitionRequest_ImageReport() throws com.mendix.core.CoreException
	{
		return getSlackImageRecognitionRequest_ImageReport(getContext());
	}

	/**
	 * @param context
	 * @return value of SlackImageRecognitionRequest_ImageReport
	 */
	public final main.proxies.ImageReport getSlackImageRecognitionRequest_ImageReport(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.ImageReport result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString());
		if (identifier != null)
			result = main.proxies.ImageReport.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SlackImageRecognitionRequest_ImageReport
	 * @param slackimagerecognitionrequest_imagereport
	 */
	public final void setSlackImageRecognitionRequest_ImageReport(main.proxies.ImageReport slackimagerecognitionrequest_imagereport)
	{
		setSlackImageRecognitionRequest_ImageReport(getContext(), slackimagerecognitionrequest_imagereport);
	}

	/**
	 * Set value of SlackImageRecognitionRequest_ImageReport
	 * @param context
	 * @param slackimagerecognitionrequest_imagereport
	 */
	public final void setSlackImageRecognitionRequest_ImageReport(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.ImageReport slackimagerecognitionrequest_imagereport)
	{
		if (slackimagerecognitionrequest_imagereport == null)
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SlackImageRecognitionRequest_ImageReport.toString(), slackimagerecognitionrequest_imagereport.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return slackImageRecognitionRequestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final main.proxies.SlackImageRecognitionRequest that = (main.proxies.SlackImageRecognitionRequest) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Main.SlackImageRecognitionRequest";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}