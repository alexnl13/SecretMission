# SecretMission
Test assignment for thinking students

Explanation of the solution.

To hide my real name in the code, I use hash transformation (hashCode()), which is a one-way operation. The getFullName() method checks hash values of the passed arguments and if they match my name hashes, it returns the first full name saved in the ALLOWED_VISITORS list, effectively substituting my real name with the name of the first person with access rights to the Secret Facility. This way, I will be able to pass the lock even if the ALLOWED_VISITORS list is updated, or some certain name is deleted from it. In case somebody else's name is entered, the method getFullName() acts as it would normally do, thus the security of the facility remains the same as it was before me messing with the code.
