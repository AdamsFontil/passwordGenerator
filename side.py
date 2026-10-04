side.java
sequence = [3, 2, 1, 2]
target_sum = 32
diff = target_sum - sum(sequence)  # 8

# Distribute the difference one by one
for i in range(diff):
    sequence[i % len(sequence)] += 1

print(sequence)