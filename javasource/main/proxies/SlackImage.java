// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies;

public class SlackImage extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Main.SlackImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		request_image("Main.request_image");

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

	public SlackImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Main.SlackImage"));
	}

	protected SlackImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject slackImageMendixObject)
	{
		super(context, slackImageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Main.SlackImage", slackImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Main.SlackImage");
	}

	/**
	 * @deprecated Use 'SlackImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static main.proxies.SlackImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return main.proxies.SlackImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static main.proxies.SlackImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new main.proxies.SlackImage(context, mendixObject);
	}

	public static main.proxies.SlackImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return main.proxies.SlackImage.initialize(context, mendixObject);
	}

	public static java.util.List<main.proxies.SlackImage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<main.proxies.SlackImage> result = new java.util.ArrayList<main.proxies.SlackImage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Main.SlackImage" + xpathConstraint))
			result.add(main.proxies.SlackImage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of request_image
	 */
	public final main.proxies.SlackImageRecognitionRequest getrequest_image() throws com.mendix.core.CoreException
	{
		return getrequest_image(getContext());
	}

	/**
	 * @param context
	 * @return value of request_image
	 */
	public final main.proxies.SlackImageRecognitionRequest getrequest_image(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		main.proxies.SlackImageRecognitionRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.request_image.toString());
		if (identifier != null)
			result = main.proxies.SlackImageRecognitionRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of request_image
	 * @param request_image
	 */
	public final void setrequest_image(main.proxies.SlackImageRecognitionRequest request_image)
	{
		setrequest_image(getContext(), request_image);
	}

	/**
	 * Set value of request_image
	 * @param context
	 * @param request_image
	 */
	public final void setrequest_image(com.mendix.systemwideinterfaces.core.IContext context, main.proxies.SlackImageRecognitionRequest request_image)
	{
		if (request_image == null)
			getMendixObject().setValue(context, MemberNames.request_image.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.request_image.toString(), request_image.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final main.proxies.SlackImage that = (main.proxies.SlackImage) obj;
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
		return "Main.SlackImage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
