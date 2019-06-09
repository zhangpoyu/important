package ssh.dao;

import ssh.entity.BookCard;

import java.util.List;

//创建IndexDao(接口类)
public interface IndexDao {

    public List<BookCard> getAllBookCard();

}
