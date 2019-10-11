Night Club ONE GmbH
###################

You are a ``Software Developer`` at Night Club ONE GmbH. The night club has a
custom piece of software for handling guest reservations. The customer may
reserve a spot for a certain event. The government has released a law requiring
a more thorough age check of their guests. The night club  therefore requires a
new feature to be added into the reservation software be able to verify their
customers age prior to approving them. Your task will be to write a module to
handle such.

The following criteria must be met:

- Age configuration must be configurable,
- An appropriate message / object must be returned,
- All tests must pass,
- Source code can be either Java or Kotlin.

Implement the given interface, that can help the night club make sure all their
guests are of legal age. It is essential to check the class does not make
mistakes to avoid legal prosecution.

Please share your solution via a public repository on GitHub or a ZIP file via
email. Make sure to also add the ``.git`` folder into your ZIP file.

How To Run Tests
****************

Make sure you have Java JDK 12 installed. We usially go with AdoptOpenJDK as
our variant flavour.

.. code-block:: bash

  $ ./gradlew test --no-daemon
