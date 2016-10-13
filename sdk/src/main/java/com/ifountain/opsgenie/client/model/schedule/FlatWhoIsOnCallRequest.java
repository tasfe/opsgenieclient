package com.ifountain.opsgenie.client.model.schedule;

/**
 * Container for the parameters to make a flat who is on call api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @see com.ifountain.opsgenie.client.IScheduleOpsGenieClient#flatWhoIsOnCall(FlatWhoIsOnCallRequest)
 */
public class FlatWhoIsOnCallRequest extends AbstractWhoIsOnCallRequest<FlatWhoIsOnCallResponse> {
    public FlatWhoIsOnCallResponse createResponse() {
        return new FlatWhoIsOnCallResponse();
    }

    public boolean isFlat() {
        return true;
    }

}
