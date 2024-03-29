package Class_Lectures;
public class person {

		private String name;
		private int age;
		public void setName(String name) {
			this.name=name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

        public class main {
	        public void main (String[]args) {
		        person p=new person();
		        p.setName("RadheKrisn");
	        	p.setAge(19);
		        System.out.println("Name : "+p.getName()+"Age : "+p.getAge());
	        }
        }

}


