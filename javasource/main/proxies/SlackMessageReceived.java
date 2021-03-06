// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class SlackMessageReceived
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject slackMessageReceivedMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.SlackMessageReceived";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EventJson("EventJson"),
		Content("Content"),
		Channel("Channel"),
		Sender("Sender"),
		Timestamp("Timestamp"),
		MessageId("MessageId"),
		IntentDetected("IntentDetected"),
		RealIntent("RealIntent"),
		ContentText("ContentText"),
		Username("Username"),
		ChannelName("ChannelName"),
		ChannelId("ChannelId"),
		SenderId("SenderId");

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

	public SlackMessageReceived(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.SlackMessageReceived"));
	}

	protected SlackMessageReceived(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject slackMessageReceivedMendixObject)
	{
		if (slackMessageReceivedMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Main.SlackMessageReceived", slackMessageReceivedMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.SlackMessageReceived");

		this.slackMessageReceivedMendixObject = slackMessageReceivedMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SlackMessageReceived.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.SlackMessageReceived initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.SlackMessageReceived.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static main.proxies.SlackMessageReceived initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.SlackMessageReceived(context, mendixObject);
	}

	public static main.proxies.SlackMessageReceived load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.SlackMessageReceived.initialize(context, mendixObject);
	}

	public static java.util.List<main.proxies.SlackMessageReceived> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<main.proxies.SlackMessageReceived> result = new java.util.ArrayList<main.proxies.SlackMessageReceived>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Main.SlackMessageReceived" + xpathConstraint))
			result.add(main.proxies.SlackMessageReceived.initialize(context, obj));
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
	 * @return value of EventJson
	 */
	public final java.lang.String getEventJson()
	{
		return getEventJson(getContext());
	}

	/**
	 * @param context
	 * @return value of EventJson
	 */
	public final java.lang.String getEventJson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EventJson.toString());
	}

	/**
	 * Set value of EventJson
	 * @param eventjson
	 */
	public final void setEventJson(java.lang.String eventjson)
	{
		setEventJson(getContext(), eventjson);
	}

	/**
	 * Set value of EventJson
	 * @param context
	 * @param eventjson
	 */
	public final void setEventJson(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String eventjson)
	{
		getMendixObject().setValue(context, MemberNames.EventJson.toString(), eventjson);
	}

	/**
	 * @return value of Content
	 */
	public final java.lang.String getContent()
	{
		return getContent(getContext());
	}

	/**
	 * @param context
	 * @return value of Content
	 */
	public final java.lang.String getContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Content.toString());
	}

	/**
	 * Set value of Content
	 * @param content
	 */
	public final void setContent(java.lang.String content)
	{
		setContent(getContext(), content);
	}

	/**
	 * Set value of Content
	 * @param context
	 * @param content
	 */
	public final void setContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String content)
	{
		getMendixObject().setValue(context, MemberNames.Content.toString(), content);
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
	 * @return value of Sender
	 */
	public final java.lang.String getSender()
	{
		return getSender(getContext());
	}

	/**
	 * @param context
	 * @return value of Sender
	 */
	public final java.lang.String getSender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sender.toString());
	}

	/**
	 * Set value of Sender
	 * @param sender
	 */
	public final void setSender(java.lang.String sender)
	{
		setSender(getContext(), sender);
	}

	/**
	 * Set value of Sender
	 * @param context
	 * @param sender
	 */
	public final void setSender(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sender)
	{
		getMendixObject().setValue(context, MemberNames.Sender.toString(), sender);
	}

	/**
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp()
	{
		return getTimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Timestamp.toString());
	}

	/**
	 * Set value of Timestamp
	 * @param timestamp
	 */
	public final void setTimestamp(java.util.Date timestamp)
	{
		setTimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of Timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.Timestamp.toString(), timestamp);
	}

	/**
	 * @return value of MessageId
	 */
	public final java.lang.Long getMessageId()
	{
		return getMessageId(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageId
	 */
	public final java.lang.Long getMessageId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MessageId.toString());
	}

	/**
	 * Set value of MessageId
	 * @param messageid
	 */
	public final void setMessageId(java.lang.Long messageid)
	{
		setMessageId(getContext(), messageid);
	}

	/**
	 * Set value of MessageId
	 * @param context
	 * @param messageid
	 */
	public final void setMessageId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long messageid)
	{
		getMendixObject().setValue(context, MemberNames.MessageId.toString(), messageid);
	}

	/**
	 * @return value of IntentDetected
	 */
	public final java.lang.String getIntentDetected()
	{
		return getIntentDetected(getContext());
	}

	/**
	 * @param context
	 * @return value of IntentDetected
	 */
	public final java.lang.String getIntentDetected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.IntentDetected.toString());
	}

	/**
	 * Set value of IntentDetected
	 * @param intentdetected
	 */
	public final void setIntentDetected(java.lang.String intentdetected)
	{
		setIntentDetected(getContext(), intentdetected);
	}

	/**
	 * Set value of IntentDetected
	 * @param context
	 * @param intentdetected
	 */
	public final void setIntentDetected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String intentdetected)
	{
		getMendixObject().setValue(context, MemberNames.IntentDetected.toString(), intentdetected);
	}

	/**
	 * @return value of RealIntent
	 */
	public final java.lang.String getRealIntent()
	{
		return getRealIntent(getContext());
	}

	/**
	 * @param context
	 * @return value of RealIntent
	 */
	public final java.lang.String getRealIntent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RealIntent.toString());
	}

	/**
	 * Set value of RealIntent
	 * @param realintent
	 */
	public final void setRealIntent(java.lang.String realintent)
	{
		setRealIntent(getContext(), realintent);
	}

	/**
	 * Set value of RealIntent
	 * @param context
	 * @param realintent
	 */
	public final void setRealIntent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String realintent)
	{
		getMendixObject().setValue(context, MemberNames.RealIntent.toString(), realintent);
	}

	/**
	 * @return value of ContentText
	 */
	public final java.lang.String getContentText()
	{
		return getContentText(getContext());
	}

	/**
	 * @param context
	 * @return value of ContentText
	 */
	public final java.lang.String getContentText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ContentText.toString());
	}

	/**
	 * Set value of ContentText
	 * @param contenttext
	 */
	public final void setContentText(java.lang.String contenttext)
	{
		setContentText(getContext(), contenttext);
	}

	/**
	 * Set value of ContentText
	 * @param context
	 * @param contenttext
	 */
	public final void setContentText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String contenttext)
	{
		getMendixObject().setValue(context, MemberNames.ContentText.toString(), contenttext);
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
	 * @return value of ChannelName
	 */
	public final java.lang.String getChannelName()
	{
		return getChannelName(getContext());
	}

	/**
	 * @param context
	 * @return value of ChannelName
	 */
	public final java.lang.String getChannelName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ChannelName.toString());
	}

	/**
	 * Set value of ChannelName
	 * @param channelname
	 */
	public final void setChannelName(java.lang.String channelname)
	{
		setChannelName(getContext(), channelname);
	}

	/**
	 * Set value of ChannelName
	 * @param context
	 * @param channelname
	 */
	public final void setChannelName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String channelname)
	{
		getMendixObject().setValue(context, MemberNames.ChannelName.toString(), channelname);
	}

	/**
	 * @return value of ChannelId
	 */
	public final java.lang.String getChannelId()
	{
		return getChannelId(getContext());
	}

	/**
	 * @param context
	 * @return value of ChannelId
	 */
	public final java.lang.String getChannelId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ChannelId.toString());
	}

	/**
	 * Set value of ChannelId
	 * @param channelid
	 */
	public final void setChannelId(java.lang.String channelid)
	{
		setChannelId(getContext(), channelid);
	}

	/**
	 * Set value of ChannelId
	 * @param context
	 * @param channelid
	 */
	public final void setChannelId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String channelid)
	{
		getMendixObject().setValue(context, MemberNames.ChannelId.toString(), channelid);
	}

	/**
	 * @return value of SenderId
	 */
	public final java.lang.String getSenderId()
	{
		return getSenderId(getContext());
	}

	/**
	 * @param context
	 * @return value of SenderId
	 */
	public final java.lang.String getSenderId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SenderId.toString());
	}

	/**
	 * Set value of SenderId
	 * @param senderid
	 */
	public final void setSenderId(java.lang.String senderid)
	{
		setSenderId(getContext(), senderid);
	}

	/**
	 * Set value of SenderId
	 * @param context
	 * @param senderid
	 */
	public final void setSenderId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String senderid)
	{
		getMendixObject().setValue(context, MemberNames.SenderId.toString(), senderid);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return slackMessageReceivedMendixObject;
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
			final main.proxies.SlackMessageReceived that = (main.proxies.SlackMessageReceived) obj;
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
		return "Main.SlackMessageReceived";
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
