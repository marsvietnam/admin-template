package com.marsvn.admintemplate.web.support;

public class JsonResponse<T> {
	private static final int FAIL_STATUS = 0;
	private static final int SUCCESS_STATUS = 1;
	
	private int statusCode;
	private String resultCode;
	private String message;
	private T data;
	
	public JsonResponse() {
		
	}

	public JsonResponse(int statusCode, String resultCode, String message, T data) {
		this.statusCode = statusCode;
		this.resultCode = resultCode;
		this.message = message;
		this.data = data;
	}
	
	public static <T> JsonResponse<T> getSuccessResponse(T data) {
		JsonResponse<T> jsonResponse = new JsonResponse<T>();
		jsonResponse.setStatusCode(JsonResponse.SUCCESS_STATUS);
		jsonResponse.setResultCode(null);
		jsonResponse.setData(data);
		return jsonResponse;
	}
	
	public static <TF> JsonResponse<TF> getFailResponse(String resultCode, String message, TF data) {
		JsonResponse<TF> jsonResponse = new JsonResponse<TF>();
		jsonResponse.setStatusCode(JsonResponse.FAIL_STATUS);
		jsonResponse.setResultCode(resultCode);
		jsonResponse.setData(data);
		return jsonResponse;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
