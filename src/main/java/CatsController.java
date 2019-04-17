import java.util.ArrayList;
import java.util.List;

public class CatsController implements Cats {

    static List<Cat> cats;

    public CatsController() {
        if (cats == null) {
            cats = new ArrayList<>();
            init();
        }

    }

        public Cat getCat(int id){
            return cats.get(id);
        }

//        public Cat getCat(String name){
//        return null;
//        }
        public List<Cat> getAllCats(){
            return cats;

        }
        public void addCat(Cat cat){
            cats.add(cat);

        }
        public void destroyCat(int id){
            cats.remove(this.getCat(id));
        }

        public void updateCat(int id, Cat cat){
            cats.set(id,cat);
        }

    public void updateCat(Cat cat){
        cats.set(cat.getId(),cat);

    }

    @Override
    public Cat destroyCat(Cat cat) {
        destroyCat(cat.getId());
    }

    private void init() {
            this.addCat(new Cat("Brody", 45, "http://ihavecat.com/wp-content/uploads/2014/04/marm-on-couter.jpg"));
            this.addCat(new Cat("Garbage", 5, "https://images.pexels.com/photos/617278/pexels-photo-617278.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"));
            this.addCat(new Cat("Hobo", 4, "https://images.pexels.com/photos/20787/pexels-photo.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500"));


        }






}//end of class
