package production;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	//Creating review map
	Map<Long,Review> reviewMap = new HashMap<Long, Review>();
	
	//Constructor
	public ReviewRepository() {
    
	//Constructor
	Review review = new Review(12345, "Saving Private Ryan", "url", "Drama", "content", "5/7/2012", "A bunch of guys save another guy in WWII", "tag");
	reviewMap.put(review.getId(),review);
	Review review2 = new Review(13579, "The Lego Movie", "Lego URL", "Comedy", "content", "3/15/2012", "Everything is awesome", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(17777, "Batman", "/images/batman.jpg", "Drama", "content", "5/7/2012", "Angry oprhan takes justice into his own hands. His only weakness: due process.", "tag");
	reviewMap.put(review3.getId(),review3);
	Review review4 = new Review(10999, "The Big Lebowski", "/images/dude.jpg", "Drama", "content", "6/24/2017", "The Greatest Story Ever Told. A man and his rug try to do the impossible: abide.", "tag");
	reviewMap.put(review4.getId(), review4);
	
	}	
	//Method find all values in review map
    public Collection<Review> findAll() {
    	return reviewMap.values();
    }
    //Find one review in the map
    public Review findOne(Long id) {
    	return reviewMap.get(id);
    }
}
