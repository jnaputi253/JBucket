package client;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;

public class S3Service {
public void createBucket(String bucketName, Client client) {
		
	}
	
	public List<Bucket> getBuckets(Client client) {
		return null;
	}
	
	public void putObject(Client client) {
		
	}
	
	public S3Object getObject(Client client) {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName, Client client) {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName, String prefix, Client client) {
		return null;
	}
	
	public void deleteBucket(String bucketName, Client client) {
		
	}
}
