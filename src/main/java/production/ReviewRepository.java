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
	Review review = new Review(12345, "No Country For Old Men", "/images/no-country.jpg", "Drama", "content", "5/7/2012", "If you come home and Javier Bardem is sitting in your living room, you're going to have a bad time.", "tag");
	reviewMap.put(review.getId(),review);
	Review review2 = new Review(13579, "There Will Be Blood", "/images/there-will-be.jpg", "Drama", "content", "3/15/2012", "Life is terrible. People are terrible. Daniel Day-Lewis can act.", "tag");
	reviewMap.put(review2.getId(),review2);
	Review review3 = new Review(17777, "Batman: The Dark Knight", "/images/joker.jpg", "Action/Drama", "content", "5/7/2012", "Angry oprhan takes justice into his own hands. His only weakness: due process.", "tag");
	reviewMap.put(review3.getId(),review3);
	Review review4 = new Review(10999, "The Big Lebowski", "/images/dude.jpg", "Comedy/Fine Art", "content", "6/24/2017", "The Greatest Story Ever Told. A man and his rug try to do the impossible: abide.", "tag");
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
