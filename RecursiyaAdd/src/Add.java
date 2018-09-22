class Add {
	int result;
	int sum(int n) {
		if (n == 1)
			return 1;
		result = sum(n - 1) + n;
		return result;
	}
}
