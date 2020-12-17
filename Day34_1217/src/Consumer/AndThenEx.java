package Consumer;

import java.util.function.Consumer;

public class AndThenEx {

	public static void main(String[] args) {

		Consumer<Member> consumerA = m -> {
			System.out.println("consumerA : "+m.getName());
		};
		
		Consumer<Member> consumerB = m -> {
			System.out.println("consumerB : "+m.getId());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", new Address("대한민국", "서울")));
		
	}

}

class Member {
	private String name;
	private String id;
	private Address address;
	
	Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}

class Address {
	private String country;
	private String city;
	
	Address(String country, String city) {
		this.country = country;
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
}