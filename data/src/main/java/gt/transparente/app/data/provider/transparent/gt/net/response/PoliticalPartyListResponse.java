package gt.transparente.app.data.provider.transparent.gt.net.response;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.util.ArrayList;

import gt.transparente.app.data.entity.PoliticalPartyEntity;

/**
 * Class that represents a Transparente.gt Response.
 */
public class PoliticalPartyListResponse extends Response {

    @SerializedName("_links")
    private JSONObject mLinks;

    @SerializedName("_embedded")
    private Result mResult;

    public Result getResult() {
        return mResult;
    }

    public void setResult(Result result) {
        this.mResult = result;
    }

    public JSONObject getLinks() {
        return mLinks;
    }

    public void setLinks(JSONObject mLinks) {
        this.mLinks = mLinks;
    }

    public class Result {
        @SerializedName("partido_politico")
        private ArrayList<PoliticalPartyEntity> mPoliticalPartyEntities;

        public ArrayList<PoliticalPartyEntity> getPoliticalPartyEntities() {
            return mPoliticalPartyEntities;
        }

        public void setPoliticalPartyEntities(ArrayList<PoliticalPartyEntity> mPoliticalPartyEntities) {
            this.mPoliticalPartyEntities = mPoliticalPartyEntities;
        }
    }
}
