// FILENAME: Log.java
package com.seth.slogger.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Log {
	// log fields
	private String logId;
	private String logContent;
	private String tagId;
	private String projId;
	private String dateCreated;
	private String timeCreated;
	
	// constructor
	public Log(String logId, String logContent, String tagId,
			   String projId, String dateCreated, String timeCreated) {
			this.logId = logId;
			this.logContent = logContent;
			this.tagId = tagId;
			this.projId = projId;
			this.dateCreated = dateCreated;
			this.timeCreated = timeCreated;
	}
	
	// getters
	public String getLogId() { return logId; }
	public String getLogContent() { return logContent; }
	public String getTagId() { return tagId; }
	public String getProjId() { return projId; }
	public String getDateCreated() { return dateCreated; }
	public String getTimeCreated() { return timeCreated; }
	
	public long getDaysSinceCreated() {
		LocalDate created = LocalDate.parse(dateCreated);
		LocalDate today	  = LocalDate.now();
		return ChronoUnit.DAYS.between(created, today);
	}
}
