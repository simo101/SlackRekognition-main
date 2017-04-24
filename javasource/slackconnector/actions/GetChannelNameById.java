// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slackconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import slackconnector.impl.SlackConnector;

public class GetChannelNameById extends CustomJavaAction<java.lang.String>
{
	private java.lang.String AuthenticationToken;
	private java.lang.String ChannelId;

	public GetChannelNameById(IContext context, java.lang.String AuthenticationToken, java.lang.String ChannelId)
	{
		super(context);
		this.AuthenticationToken = AuthenticationToken;
		this.ChannelId = ChannelId;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		logger.info("GetChannelName: " + this.ChannelId);
		String channelName = null;
		try {
			SlackConnector connector = new SlackConnector(this.AuthenticationToken, logger);
			channelName = connector.getChannelName(this.ChannelId);
		} catch (Exception e) {
			logger.info(String.format("Failed to get channelname: %s", e.getMessage()));
			throw e;
		}
		logger.info(String.format("Found channel name %s for id %s", channelName, ChannelId));
		return channelName;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetChannelNameById";
	}

	// BEGIN EXTRA CODE
    private ILogNode logger = Core.getLogger(SlackConnector.LOGNODE);
	// END EXTRA CODE
}