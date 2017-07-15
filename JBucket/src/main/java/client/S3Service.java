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
		} catch(SdkClientException exception) {
			System.out.println(exception.getMessage());
			System.exit(1);
		}
		
		System.out.println(String.format("The bucket '%s' has been created\n", bucketName));
	}
	
	public void deleteBucket(String bucketName, AmazonS3 client) {
		try {
			client.deleteBucket(bucketName);
		} catch(SdkClientException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		System.out.println("The bucket has been deleted");
	}
	
	public List<Bucket> getBuckets(AmazonS3 client) {
		List<Bucket> buckets = new ArrayList<>();
		
		try {
			buckets = client.listBuckets();
		} catch(SdkClientException e) {
			System.out.println(e.getMessage());
			System.exit(1);;
		}
		
		return buckets;
	}
	
	public void displayBuckets(AmazonS3 client) {
		List<Bucket> buckets = new ArrayList<>();
		
		try {
			System.out.println("Grabbing buckets...");
			buckets = client.listBuckets();
		} catch(SdkClientException e) {
			System.out.println(e.getMessage());
			System.exit(1);;
		}
		
		if(buckets.size() == 0) {
			System.out.println("You do not have any buckets");
		} else {
			for(Bucket bucket : buckets) {
				System.out.println(bucket.getName());
			}
		}
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
