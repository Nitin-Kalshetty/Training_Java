package CastingPackage;

public class CastingPractice {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.parentMethod();
		Child child = (Child) parent;
		child.childMethod();

	}

}
