package client;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;

public class S3Service {
	public void createBucket(String bucketName, AmazonS3 client) {
		try {
			client.createBucket(bucketName);
			System.out.println(String.format("The bucket '%s' has been created\n", bucketName));
		} catch(SdkClientException e) {
			System.out.printf("%s\n\n", e.getMessage());
		}
	}
	
	public void deleteBucket(String bucketName, AmazonS3 client) {
		try {
			client.deleteBucket(bucketName);
		} catch(SdkClientException e) {
			System.out.printf("%s\n\n", e.getMessage());
		}
		
		System.out.println("The bucket has been deleted");
	}
	
	public List<Bucket> getBuckets(AmazonS3 client) {
		return null;
	}
	
	public void displayBuckets(AmazonS3 client) {
		
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
}
