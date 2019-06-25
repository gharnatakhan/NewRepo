package com.fdmgroup.model;

public class Comment {
	
	private int commentId;
	private int userId;
	private String message;
	public Comment(int commentId, int userId, String message) {
		super();
		this.commentId = commentId;
		this.userId = userId;
		this.message = message;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", userId=" + userId + ", message=" + message + "]";
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
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
