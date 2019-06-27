package com.fdmgroup.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	private int commentId;

	
	private String message;
	
	private int userId;

//	private Comment comment;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobPostingId")
	private JobPosting jobPosting;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int commentId, int userId, String message, Comment comment, JobPosting jobPosting) {
		this.commentId = commentId;
		this.userId = userId;
		this.message = message;
//		this.comment = comment;
		this.jobPosting = jobPosting;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public Comment getComment() {
//		return comment;
//	}

//	public void setComment(Comment comment) {
//		this.comment = comment;
//	}

	public JobPosting getJobPosting() {
		return jobPosting;
	}

	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
	}


}
