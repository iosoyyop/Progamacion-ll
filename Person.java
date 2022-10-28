class Person extends Point{
    private int age;
    private String name;
    private String gender;
    private Point point;
    private int stars;
    public Person(int age,String name,String gender,Point point,int stars){
        super(age, stars);
        this.age=age;
        this.gender=gender;
        this.name=name;
        this.point=point;
        this.stars=stars;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public Point getPoint() {
        return point;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStars() {
        return stars;
    }
}