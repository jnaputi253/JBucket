package client;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;

public class S3Service {
	public void createBucket(String bucketName, AmazonS3 client) {
		
	}
	
	public List<Bucket> getBuckets(AmazonS3 client) {
		return null;
	}
	
	public void putObject(AmazonS3 client) {
		
	}
	
	public S3Object getObject(AmazonS3 client) {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName, AmazonS3 client) {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName, String prefix, AmazonS3 client) {
		return null;
	}
	
	public void deleteBucket(String bucketName, AmazonS3 client) {
		
	}
}
