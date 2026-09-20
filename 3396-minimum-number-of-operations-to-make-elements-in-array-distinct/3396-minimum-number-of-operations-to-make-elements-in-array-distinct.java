class Solution {
        public int minimumOperations(int[] nums) {
                int operations = 0;

                        while (true) {
                                    HashSet<Integer> set = new HashSet<>();
                                                boolean distinct = true;

                                                            for (int num : nums) {
                                                                            if (set.contains(num)) {
                                                                                                distinct = false;
                                                                                                                    break;
                                                                                                                                    }
                                                                                                                                                    set.add(num);
                                                                                                                                                                }

                                                                                                                                                                            if (distinct) {
                                                                                                                                                                                            return operations;
                                                                                                                                                                                                        }

                                                                                                                                                                                                                    operations += 1;

                                                                                                                                                                                                                                int remove = Math.min(3, nums.length);

                                                                                                                                                                                                                                            int[] newNums = new int[nums.length - remove];

                                                                                                                                                                                                                                                        for (int i = remove; i < nums.length; i++) {
                                                                                                                                                                                                                                                                        newNums[i - remove] = nums[i];
                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                nums = newNums;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            }
