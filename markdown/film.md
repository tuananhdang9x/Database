# Database film

**Tạo database**
```sql
CREATE DATABASE film;
```

**Tạo bảng film**
```sql
CREATE TABLE film(
            id INT PRIMARY KEY AUTO_INCREMENT,
            title TEXT NOT NULL,
            description TEXT NOT NULL,
            poster TEXT NOT NULL,
            length INT NOT NULL,
            rating VARCHAR(10) NOT NULL,
            id_directors INT NOT NULL,
            release_date DATE NOT NULL,
            FOREIGN KEY(id_directors) REFERENCES directors(id)
        )
```

**Tạo bảng directors**
```sql
CREATE TABLE directors(
            id INT PRIMARY KEY AUTO_INCREMENT,
            name TEXT NOT NULL,
            avartar TEXT NOT NULL,
            description TEXT NOT NULL
        )
```
**Tạo bảng actor**
```sql
CREATE TABLE actor(
            id INT PRIMARY KEY AUTO_INCREMENT,
            last_name TEXT NOT NULL,
            first_name TEXT NOT NULL,
            avartar TEXT
        )
```

**Tạo bảng film_actor**
```sql
CREATE TABLE film_actor(
            id_film INT,
            id_actor INT,
            PRIMARY KEY(id_film,id_actor),
            FOREIGN KEY(id_film) REFERENCES film(id),
            FOREIGN KEY(id_actor) REFERENCES actor(id)
        )
```

**Tạo bảng category**
```sql
CREATE TABLE category(
            id INT PRIMARY KEY AUTO_INCREMENT,
            name TEXT NOT NULL
        )
```

**Tạo bảng film_category**
```sql
CREATE TABLE film_category(
            id_film INT,
            id_category INT,
            PRIMARY KEY(id_film,id_category),
            FOREIGN KEY(id_film) REFERENCES film(id),
            FOREIGN KEY(id_category) REFERENCES category(id)
        )
```

![image](image/film.PNG)



