import java.util.List;

public interface Cats {

    List<Cat> getAllCats();
    Cat getCat(int id); //find indiv record by it's id
    Cat addCat(Cat cat); //insert a new record
    Cat updateCat(Cat cat); //update an existing record
    Cat destroyCat(Cat cat); //remove a record
}
