class Solution {
        public int minOperations(int[] nums, int k) {
                int operations = 0;
                        int[] freq = new int[100001];

                                for (int num : nums) {
                                            if (num < k) {
                                                            return -1;
                                                                        }
                                                                                    freq[num] = 1;
                                                                                            }

                                                                                                    for (int i = k + 1; i < freq.length; i++) {
                                                                                                                if (freq[i] == 1) {
                                                                                                                                operations++;
                                                                                                                                            }
                                                                                                                                                    }

                                                                                                                                                            return operations;
                                                                                                                                                                }
                                                                                                                                                                }
