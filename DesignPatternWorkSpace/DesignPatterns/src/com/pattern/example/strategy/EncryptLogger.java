package com.pattern.example.strategy;

import com.pattern.example.factory.FileLogger;

/* The Strategy pattern is useful when there is a set of related algorithms and a
client object needs to be able to dynamically pick and choose an algorithm from
this set that suits its current need.

The Strategy pattern suggests keeping the implementation of each of the
algorithms in a separate class. Each such algorithm encapsulated in a separate
class is referred to as a strategy. An object that uses a Strategy object is often
referred to as a context object.

With different Strategy objects in place, changing the behavior of a Context
object is simply a matter of changing its Strategy object to the one that
implements the required algorithm.  */

public class EncryptLogger {
	private EncryptionStrategy currEncryptionStrategy;
	private FileLogger logger;

	public EncryptLogger(FileLogger inp_logger) {
		logger = inp_logger;
		// set the default encryption strategy
		setEncryptionStrategy(new SimpleEncryption());
	}

	public void log(String msg) {
		/* Added functionality */
		msg = encrypt(msg);
		/*
		 * Now forward the encrypted text to the FileLogger for storage
		 */
		logger.log(msg);
	}

	public String encrypt(String msg) {
		/*
		 * Apply encryption using the current encryption strategy
		 */
		return currEncryptionStrategy.encrypt(msg);
	}

	public void setEncryptionStrategy(EncryptionStrategy strategy) {
		currEncryptionStrategy = strategy;
	}
}
