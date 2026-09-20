class Solution {
        public long maximumTripletValue(int[] nums) {
                int n = nums.length;

                        long[] suffixMax = new long[n];

                                suffixMax[n - 1] = nums[n - 1];

                                        for (int i = n - 2; i >= 0; i--) {
                                                    suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
                                                            }

                                                                    long ans = 0;
                                                                            long maxLeft = nums[0];

                                                                                    for (int j = 1; j < n - 1; j++) {
                                                                                                long value = (maxLeft - nums[j]) * suffixMax[j + 1];

                                                                                                            ans = Math.max(ans, value);

                                                                                                                        maxLeft = Math.max(maxLeft, nums[j]);
                                                                                                                                }

                                                                                                                                        return ans;
                                                                                                                                            }
                                                                                                                                            }
