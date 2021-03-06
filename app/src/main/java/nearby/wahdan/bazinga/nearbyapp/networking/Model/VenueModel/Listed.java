package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Listed{

	@SerializedName("count")
	private int count;

	@SerializedName("groups")
	private List<GroupsItem> groups;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setGroups(List<GroupsItem> groups){
		this.groups = groups;
	}

	public List<GroupsItem> getGroups(){
		return groups;
	}

	@Override
 	public String toString(){
		return 
			"Listed{" + 
			"count = '" + count + '\'' + 
			",groups = '" + groups + '\'' + 
			"}";
		}
}