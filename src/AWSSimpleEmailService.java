import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;

public class AWSSimpleEmailService {
	public static void main(String[] args) {

		String FROM = "";
		String TO = "";
		String newUserName="";
		String newUserPassword="";
		String SUBJECT = "Welcome to Amazon Glacier";
		String BODY = "This email was sent through Amazon SES by using the AWS SDK for Java.\n\n\nAmazon Glacier is an extremely low-cost storage service that provides secure and durable storage for data archiving and backup. In order to keep costs low, Amazon Glacier is optimized for data that is infrequently accessed and for which retrieval times of several hours are suitable. With Amazon Glacier, customers can reliably store large or small amounts of data for as little as $0.01 per gigabyte per month, a significant savings compared to on-premises solutions.Companies typically over-pay for data archiving. First, they're forced to make an expensive upfront payment for their archiving solution (which does not include the ongoing cost for operational expenses such as power, facilities, staffing, and maintenance). Second, since companies have to guess what their capacity requirements will be, they understandably over-provision to make sure they have enough capacity for data redundancy and unexpected growth. This set of circumstances results in under-utilized capacity and wasted money. With Amazon Glacier, you pay only for what you use. Amazon Glacier changes the game for data archiving and backup as you pay nothing upfront, pay a very low price for storage, and can scale your usage up or down as needed, while AWS handles all of the operational heavy lifting required to do data retention well. It only takes a few clicks in the AWS Management Console to set up Amazon Glacier and then you can upload any amount of data you choose."
				+ "\n\n\n\n\n You can now use the following login credentials.\n\n\n"
				+ "Username is :: "
				+ newUserName
				+ "\nPassword is :: "
				+ newUserPassword;

	//	credentials.getAWSAccessKeyId();
	//	credentials.getAWSSecretKey();
		Destination destination = new Destination()
				.withToAddresses(new String[] { TO });
		Content subject = new Content().withData(SUBJECT);
		Content textBody = new Content().withData(BODY);
		
		Body body = new Body().withText(textBody);
		Message message = new Message().withSubject(subject).withBody(body);
		
		SendEmailRequest request = new SendEmailRequest().withSource(FROM)
				.withDestination(destination).withMessage(message);
		try {
			System.out.println("Attempting to send an email through AmazonSES by using the AWS SDK for Java...");
	//		AmazonSimpleEmailServiceClient client = new AmazonSimpleEmailServiceClient(credentials);
	//		client.sendEmail(request);
			System.out.println("Email sent!");
		} catch (Exception ex) {
			System.out.println("The email was not sent.");
			System.out.println("Error message: " + ex.getMessage());
		}
	}

}
