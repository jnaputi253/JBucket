package client;

import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;

public class Client {
	private AmazonS3 client;
	private S3Service service;
	
	public Client() {
		try {
			client = AmazonS3ClientBuilder.standard()
					.withRegion(Regions.US_WEST_2)
					.withCredentials(new ProfileCredentialsProvider("default"))
					.build();
		} catch(AmazonClientException e) {
			System.out.println(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (/Users/jnaputi253/.aws/credentials), and is in valid format.");
			System.exit(1);
		}
		
		service = new S3Service();
	}
	
	public void createBucket(String bucketName) {
		service.createBucket(bucketName, client);
	}
	
	public void deleteBucket(String bucketName) {
		service.deleteBucket(bucketName, client);
	}
	
	public List<Bucket> getBuckets() {
		return null;
	}
	
	public void displayBuckets() {
		service.displayBuckets(client);
	}
	
	public void putObject() {
		
	}
	
	public S3Object getObject() {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName) {
		return null;
	}
	
	public ObjectListing getObjectsFromBucket(String bucketName, String prefix) {
		return null;
	}
	
	public void saySomething() {
		System.out.println("Client ready");
	}
}
