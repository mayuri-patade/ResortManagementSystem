package resort.domain;

class NotAvailable extends Exception {
	
	@Override
	public String toString() {
		return "Invalid Option";
	}
}