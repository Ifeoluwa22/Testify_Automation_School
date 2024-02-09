import unittest


class MyTestCase(unittest.TestCase):
    def test_string(self):
        string_a = "Testify"
        string_b = "Testlify"
        print("Are the strings equal?")
        self.assertEqual( string_a, string_b)

    def test_number(self):
        int_a = 30
        int_b = 30
        self.assertEqual( int_a, int_b)  # add assertion here


if __name__ == '__main__':
    unittest.main()


# Create a test case that compares two strings
# Create another test case that compares different numbers
#
# Use any unit testing framework from this week's lessons.