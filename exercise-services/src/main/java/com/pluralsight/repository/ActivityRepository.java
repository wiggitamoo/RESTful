package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;

public interface ActivityRepository {

	public abstract List<Activity> findAllActivities();

	public abstract Activity findActivity(String activityId);

	public abstract Activity create(Activity activity);

	public abstract Activity update(Activity activity);

	public abstract void delete(String activityId);

	public abstract List<Activity> findByDescription(
			List<String> descriptions, int durationFrom, int durationTo);

	public abstract List<Activity> findByConstraints(ActivitySearch search);

}