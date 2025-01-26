## 2.1
Question 1:
1. Register direct
2. Immediate addressing
3. Register indirect 
4. Register indirect with offset
5. Register indirect with index register
6. Register indirect with offset, pre-index autoindex
7. Register indirect with offset, post-index autoindex
8. Register indirect with index register, pre-index autoindex
9. Register indirect with index register, post-index autoindex

Question 2:
1. 0x04
2. 0x0100
3. 0x00000102
4. 0xFFFEAABB
5. 0XFFFEAABB
6. 0XFFFEAABB
7. 0x00000102
8. 0xFFFEAABB
9. 0x00000102

Question 3:
1. MOV R0, R3
2. MOV R0, `0x0102` WRONG
3. MOV R0, [R1]

Question 4:
1. Register indirect. The start address of the array can be stored in a register, and then the next element can be calculated from there with an offset.
2. Immediate addressing. Since it is a constant value, there is no need to store the value in any registers. We can directly use immediate addressing to load the value.
3. Register direct. Since this is a one-time initializing operation, we can use register direct.

Question 5:
- MOV R0, R1
- STR R0, [R1, R2]

Question 6:

