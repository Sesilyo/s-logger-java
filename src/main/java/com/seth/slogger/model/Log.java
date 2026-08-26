// FILENAME: Log.java
package com.seth.slogger.model;

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
			this.projId = dateCreated;
			this.projId = timeCreated;
			
	}
	
	// getters
	public String getLogId() { return logId; }
	public String getLogContent() { return logContent; }
	public String getTagId() { return tagId; }
	public String getProjId() { return projId; }
	public String getDateCreated() { return dateCreated; }
	public String getTimeCreated() { return timeCreated; }
}
