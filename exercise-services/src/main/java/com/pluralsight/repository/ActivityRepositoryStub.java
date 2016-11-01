package com.pluralsight.repository;



import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;
import com.pluralsight.model.User;

/*
 * Called a stub because it mimics a database.
 */
public class ActivityRepositoryStub implements ActivityRepository {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.ActivityRepository#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities() {
		/*
		 * This should be replaced by a database call.
		 */
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		
		if(activityId.equals("7777")) {
			return null;
		}
		
		// Replace with database query to pull something back.
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activity1.setId("1234");
		
		// add a user to the activity
		User user = new User();
		user.setId("5678");
		user.setName("Brian");
		activity1.setUser(user);
		
		return activity1;
	}

	@Override
	public Activity create(Activity activity) {
		// should issue an insert statement to the db.
		// potentially add id on the server
		activity.setId("0000");
		return activity;
	}

	@Override
	public Activity update(Activity activity) {
		// search the database to see if we have an activity with that id already
		// select * from activity where id=???
		// if rs size == 0
		// insert into Activity table
		// else
		// update the Activity table with changes passing in
		
		return activity;
	}

	@Override
	public void delete(String activityId) {
		// make sql call
		// delete from activity where activityId = ?
	}

	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		// select * from activities where description in (?,?,?) and duration > ? and duration < ?
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		activity.setId("2345");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		return activities;
	}

	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {
		// search database for constraints
		
		System.out.println(search.getDurationTo());
		System.out.println(search.getSearchType());
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity = new Activity();
		activity.setId("2345");
		activity.setDescription("swimming");
		activity.setDuration(55);
		
		activities.add(activity);
		return activities;
	}
}
