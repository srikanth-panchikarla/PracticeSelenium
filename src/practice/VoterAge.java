package practice;



public class VoterAge {

	public static void main(String[] args) throws InvalidAgeException {
		int ageOfVoter = 12;
		checkValidAge(ageOfVoter);

	}

	public static void checkValidAge(int age) throws InvalidAgeException {

		if (age < 18)

		{

			throw new InvalidAgeException("This person is not eligible for voting due to age constrain");

		}

	}

}
