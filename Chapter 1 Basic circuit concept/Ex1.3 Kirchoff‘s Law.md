Ex1.3 Find currents and voltages shown in Fig 2.27,
<div align=center><img src="Figure 2.27.bmp" style="zoom:50%;" />
<center>Figure 2.27</center>
solution：
We apply Ohm's Law and Kirchhoff's laws. By Ohm's law,


$$
v1 = 8i1, v2 = 3i2, v3 =6i3
$$

<center>equation 1.3.1</center>

Since the voltage and current of each resistor are related by Ohm's law as shown, we  are really looking for three things:(v1,v2,v3) or(i1,i2,i3). At node a, KCL gives
$$
i1-i2-i3=0
$$

<center>equation 1.3.2</center>

Applying KVL to loop 1as in Fig 2.27，
$$
-30+8i1+3i2 = 0
$$
or
$$
i1 =\frac{(30-3i2)}{8}
$$

<center>equation 1.3.3</center>

Applying KVL to loop 2,
$$
-v2 + v3 =0  => v3=v2
$$

<center>equation 1.3.4</center>

Express v2 and v3 with i2 and i3. Equation 1.3.4 becomes
$$
6i3 = 3i2 => i3 = \frac{i2}{2}
$$

<center>equation 1.3.5</center>

Substitute Eqs. (1.3.3) and (1.3.5) into (1.3.2) gives
$$
\frac{30-i2}{8}-i2-\frac{i2}{2} =0
$$

$$
i2 = 2 A
$$

From the value of i2, we can obtain
$$
i1 = 3 A,
i3 = 1 A,
v1 = 24 V,
v2 = 6 V,
v3 = 6 V
$$
