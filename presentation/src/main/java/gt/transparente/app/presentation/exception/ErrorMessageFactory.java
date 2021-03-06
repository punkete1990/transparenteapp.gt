
package gt.transparente.app.presentation.exception;

import android.content.Context;

import gt.transparente.app.data.exception.NetworkConnectionException;
import gt.transparente.app.data.exception.NoMoreDataAvailableException;
import gt.transparente.app.data.exception.PoliticalPartyNotFoundException;
import gt.transparente.app.presentation.R;

/**
 * Factory used to create error messages from an Exception as a condition.
 */
public class ErrorMessageFactory {

    private ErrorMessageFactory() {
        //empty
    }

    /**
     * Creates a String representing an error message.
     *
     * @param context   Context needed to retrieve string resources.
     * @param exception An exception used as a condition to retrieve the correct error message.
     * @return {@link String} an error message.
     */
    public static String create(Context context, Exception exception) {
        String message = context.getString(R.string.exception_message_generic);

        if (exception instanceof NetworkConnectionException) {
            message = context.getString(R.string.exception_message_no_connection);
        } else if (exception instanceof PoliticalPartyNotFoundException) {
            message = context.getString(R.string.exception_message_political_party_not_found);
        }  else if (exception instanceof NoMoreDataAvailableException) {
            message = context.getString(R.string.exception_message_no_more_data_available);
        }

        return message;
    }
}
