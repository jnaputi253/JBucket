package client;

public class PutRequestHandler {
	private String bucketName;
	private String key;
	private Object objectToUpload;
	
	private PutRequestHandler(String bucketName, String key, Object objectToUpload) {
		this.bucketName = bucketName;
		this.key = key;
		this.objectToUpload = objectToUpload;
	}
	
	public static class Builder {
		private String bucketName;
		private String key;
		private Object objectToUpload;
		
		public PutRequestHandler.Builder useBucketName(String bucketName) {
			this.bucketName = bucketName;
			return this;
		}
		
		public PutRequestHandler.Builder withKey(String key) {
			this.key = key;
			return this;
		}
		
		public PutRequestHandler.Builder andTargetObject(Object objectToUpload) {
			this.objectToUpload = objectToUpload;
			return this;
		}
		
		public PutRequestHandler build() {
			return new PutRequestHandler(this.bucketName, this.key, this.objectToUpload);
		}
	}
	
	public String getBucketName() {
		return this.bucketName;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public Object getObjectToUpload() {
		return this.objectToUpload;
	}
}
