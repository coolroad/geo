package com.github.davidmoten.geo;

import java.util.Set;

public class Coverage {

	private final Set<String> hashes;
	private final double ratio;

	public Coverage(Set<String> hashes, double ratio) {
		super();
		this.hashes = hashes;
		this.ratio = ratio;
	}

	public Set<String> getHashes() {
		return hashes;
	}

	public double getRatio() {
		return ratio;
	}

	public int getHashLength() {
		if (hashes.size() == 0)
			return 0;
		else
			return hashes.iterator().next().length();
	}
}